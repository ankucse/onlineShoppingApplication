package com.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDTO {

    @NotNull(message = "Enter Your Mobile Number")
    @Pattern(regexp = "[7896]{1}[0-9]{9}", message = "Input a valid mobile number")
    private String mobileNo;
    @NotNull(message = "Enter Your Password")
    private String password;

}
