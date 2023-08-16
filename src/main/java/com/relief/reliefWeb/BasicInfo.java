package com.relief.reliefWeb;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
//@Table(name = "nubeeroc_reliefWebTest")
public class BasicInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fullName;

    private String email;
    private String phoneNumber;
    private String productName;
    private String productSummary;
    private String projectBrief;
    private String projectFeatures;
    private String developmentPhase;
    private String brandingGuides;
    private String relevantBrandBook;
    private String importance;
    private String builtProductBefore;
    private String bestAppliesToYou;
    private String servicesInNeedOf;
    private String acquiredFunding;
    private String fundingStage;
    private String budget;
    private String projectCommerence;
    private String projectCompletion;





}
