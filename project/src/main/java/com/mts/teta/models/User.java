package com.mts.teta.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class User {
    private String firstName;
    private String lastName;
    @JsonIgnore
    private String msisdn;
}
