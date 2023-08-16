package com.relief.reliefWeb.service;

import com.relief.reliefWeb.dto.*;
import com.relief.reliefWeb.response.ApiResponse;
import org.springframework.stereotype.Service;

@Service
public interface BasicInfoService {
// Long createBasicInfo(CreateBasicInfoDto basicInfoDto);

 ApiResponse<Long> createBasicInfo(CreateBasicInfoDto basicInfoDto);
// void addOnboarding(Long id, OnboardingDto basicInfoDto);

 ApiResponse<String> addOnboarding(Long id, OnboardingDto basicInfoDto);

 ApiResponse<String> addProjectBrief(Long id, ProjectBriefDto basicInfoDto);

 ApiResponse<String> addBranding(Long id, BrandingDto basicInfoDto);

 ApiResponse<String> addFunding(Long id, FundingDto basicInfoDto);

 ApiResponse<String> addTimeline(Long id, TimeLineDto basicInfoDto) ;
}
