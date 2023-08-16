package com.relief.reliefWeb.controller;

import com.relief.reliefWeb.BasicInfo;
import com.relief.reliefWeb.dto.*;
import com.relief.reliefWeb.response.ApiResponse;
import com.relief.reliefWeb.service.BasicInfoService;
import com.relief.reliefWeb.service.BasicInfoServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/basicInfo")
@CrossOrigin(origins = "http://localhost:3000")

public class BasicInfoController {
    @Autowired
    BasicInfoService basicInfoService;

    @Autowired
    BasicInfoServiceImplementation basicInfoServiceImplementation;




    @GetMapping
    public ResponseEntity<List<BasicInfo>> getAllBasicInfo() {
        List<BasicInfo> allBasicInfo = basicInfoServiceImplementation.getAllBasicInfo();
        return ResponseEntity.ok(allBasicInfo);
    }

    @PostMapping
    public ResponseEntity<ApiResponse<Long>> createBasicInfo(@RequestBody CreateBasicInfoDto basicInfoDto) {
        ApiResponse<Long> response = basicInfoService.createBasicInfo(basicInfoDto);

        if (response.getStatus() == 200) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(response.getStatus()).body(response);
        }
    }




    @PutMapping("/{id}/onboarding")
    public ResponseEntity<ApiResponse<String>> addOnboarding(
            @PathVariable Long id,
            @RequestBody OnboardingDto onboardingDto) {

        ApiResponse<String> response = basicInfoService.addOnboarding(id, onboardingDto);

        if (response.getStatus() == 200) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(response.getStatus()).body(response);
        }
    }
    @PutMapping("/{id}/project-brief")
    public ResponseEntity<ApiResponse<String>> addProjectBrief(
            @PathVariable Long id,
            @RequestBody ProjectBriefDto projectBriefDto) {

        ApiResponse<String> response = basicInfoService.addProjectBrief(id, projectBriefDto);

        if (response.getStatus() == 200) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(response.getStatus()).body(response);
        }
    }

    @PutMapping("/{id}/branding")
    public ResponseEntity<ApiResponse<String>> addBranding(
            @PathVariable Long id,
            @RequestBody BrandingDto brandingDto) {

        ApiResponse<String> response = basicInfoService.addBranding(id, brandingDto);

        if (response.getStatus() == 200) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(response.getStatus()).body(response);
        }
    }

    @PutMapping("/{id}/funding")
    public ResponseEntity<ApiResponse<String>> addFunding(
            @PathVariable Long id,
            @RequestBody FundingDto fundingDto) {

        ApiResponse<String> response = basicInfoService.addFunding(id, fundingDto);

        if (response.getStatus() == 200) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(response.getStatus()).body(response);
        }
    }

    @PutMapping("/{id}/timeline")
    public ResponseEntity<ApiResponse<String>> addTimeline(
            @PathVariable Long id,
            @RequestBody TimeLineDto timeLineDto) {

        ApiResponse<String> response = basicInfoService.addTimeline(id, timeLineDto);

        if (response.getStatus() == 200) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(response.getStatus()).body(response);
        }
    }

}
