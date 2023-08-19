package com.relief.reliefWeb.controller;

import com.relief.reliefWeb.BasicInfo;
import com.relief.reliefWeb.dto.*;
import com.relief.reliefWeb.response.Responses;
import com.relief.reliefWeb.service.BasicInfoService;
import com.relief.reliefWeb.service.BasicInfoServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.util.List;


@RestController
@RequestMapping("/basicInfo")
@Api(tags = "Basic Information")
@CrossOrigin(origins = "http://localhost:3000")

public class BasicInfoController {
    @Autowired
    BasicInfoService basicInfoService;

    @Autowired
    BasicInfoServiceImplementation basicInfoServiceImplementation;




    @GetMapping
    @ApiOperation(value = "Get all basic information")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Success", response = BasicInfo.class),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    public ResponseEntity<List<BasicInfo>> getAllBasicInfo() {
        List<BasicInfo> allBasicInfo = basicInfoServiceImplementation.getAllBasicInfo();
        return ResponseEntity.ok(allBasicInfo);
    }

    @PostMapping
    public ResponseEntity<Responses<Long>> createBasicInfo(@RequestBody CreateBasicInfoDto basicInfoDto) {
        Responses<Long> response = basicInfoService.createBasicInfo(basicInfoDto);

        if (response.getStatus() == 200) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(response.getStatus()).body(response);
        }
    }




    @PutMapping("/{id}/onboarding")
    public ResponseEntity<Responses<String>> addOnboarding(
            @PathVariable Long id,
            @RequestBody OnboardingDto onboardingDto) {

        Responses<String> response = basicInfoService.addOnboarding(id, onboardingDto);

        if (response.getStatus() == 200) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(response.getStatus()).body(response);
        }
    }
    @PutMapping("/{id}/project-brief")
    public ResponseEntity<Responses<String>> addProjectBrief(
            @PathVariable Long id,
            @RequestBody ProjectBriefDto projectBriefDto) {

        Responses<String> response = basicInfoService.addProjectBrief(id, projectBriefDto);

        if (response.getStatus() == 200) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(response.getStatus()).body(response);
        }
    }

    @PutMapping("/{id}/branding")
    public ResponseEntity<Responses<String>> addBranding(
            @PathVariable Long id,
            @RequestBody BrandingDto brandingDto) {

        Responses<String> response = basicInfoService.addBranding(id, brandingDto);

        if (response.getStatus() == 200) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(response.getStatus()).body(response);
        }
    }

    @PutMapping("/{id}/funding")
    public ResponseEntity<Responses<String>> addFunding(
            @PathVariable Long id,
            @RequestBody FundingDto fundingDto) {

        Responses<String> response = basicInfoService.addFunding(id, fundingDto);

        if (response.getStatus() == 200) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(response.getStatus()).body(response);
        }
    }

    @PutMapping("/{id}/timeline")
    public ResponseEntity<Responses<String>> addTimeline(
            @PathVariable Long id,
            @RequestBody TimeLineDto timeLineDto) {

        Responses<String> response = basicInfoService.addTimeline(id, timeLineDto);

        if (response.getStatus() == 200) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(response.getStatus()).body(response);
        }
    }

}
