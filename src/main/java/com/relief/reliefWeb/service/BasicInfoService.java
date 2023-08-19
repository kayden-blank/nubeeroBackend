package com.relief.reliefWeb.service;

import com.relief.reliefWeb.dto.*;
import com.relief.reliefWeb.response.Responses;
import org.springframework.stereotype.Service;

@Service
public interface BasicInfoService {
// Long createBasicInfo(CreateBasicInfoDto basicInfoDto);

 Responses<Long> createBasicInfo(CreateBasicInfoDto basicInfoDto);
// void addOnboarding(Long id, OnboardingDto basicInfoDto);

 Responses<String> addOnboarding(Long id, OnboardingDto basicInfoDto);

 Responses<String> addProjectBrief(Long id, ProjectBriefDto basicInfoDto);

 Responses<String> addBranding(Long id, BrandingDto basicInfoDto);

 Responses<String> addFunding(Long id, FundingDto basicInfoDto);

 Responses<String> addTimeline(Long id, TimeLineDto basicInfoDto) ;
}
