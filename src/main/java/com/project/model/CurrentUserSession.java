package com.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class CurrentUserSession {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    @Column(unique = true)
    private Integer UserId;

    private String uniqueId;
    private LocalDateTime time;

    public CurrentUserSession(Integer userId, String uniqueId, LocalDateTime time) {
        super();
        UserId = userId;
        this.uniqueId = uniqueId;
        this.time = time;
    }


}
