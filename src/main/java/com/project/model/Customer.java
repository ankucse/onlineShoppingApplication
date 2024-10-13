package com.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer customerId;
    @NotNull(message = "please input a valid name")
    @Pattern(regexp = "(?i)(^[a-z]+)[a-z .,-]((?! .,-)$){1,25}$", message = "please input a valid name")
    private String firstName;
    @NotNull(message = "please input a valid name")
    @Pattern(regexp = "(?i)(^[a-z]+)[a-z .,-]((?! .,-)$){1,25}$", message = "please input a valid name")
    private String lastName;
    @NotNull(message = "Please Enter your Mobile Number")
    @Pattern(regexp = "[7896]{1}[0-9]{9}", message = "Input a valid mobile number")
    private String mobileNumber;
    @Pattern(regexp = "^(.+)@(\\S+)$", message = "Input a valid email address")
    private String email;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Address> addresslist = new ArrayList<>();


}
