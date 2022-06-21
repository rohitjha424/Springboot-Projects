package com.milestone.doctorservice.vo;


import com.milestone.doctorservice.entity.Doctor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private Doctor doctor;
    private Hospital hospital;
}