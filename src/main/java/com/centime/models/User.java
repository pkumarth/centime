package com.centime.models;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ApiModel(description = "Model to create User")
public class User {
    @ApiModelProperty(notes = "User Name", example = "praveen")
    private String name;
    @ApiModelProperty(notes = "User Sur Name", example = "thakur")
    private String surname;
}

