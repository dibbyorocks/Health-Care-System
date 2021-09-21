package com.cg.healthcaresystem.model;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.util.List;
import java.util.Set;

import static javax.persistence.GenerationType.AUTO;

@Data
@Entity
@Table(name="Diagnostic_Test")
public class DiagnosticTest {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Integer id;
    @NotNull(message = "Please Enter Diagnostic Test Name:")
    private String testName;
    @NotNull(message="Please Enter Diagnostic Test Price:")
    private double testPrice;
    @NotNull(message = "Please Enter Diagnostic Test Normal Value:")
    private String normalValue;

    @NotNull(message="Please Enter Diagnostic Center Units:")
    private String units;

    //@NotNull(message= "Please Enter Diagnostic Test Centers:")
    private Set<DiagnosticCenter> diagnosticCenters;


}