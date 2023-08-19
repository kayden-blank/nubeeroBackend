package com.relief.reliefWeb.service;
import java.util.List;
import java.util.Optional;
import com.relief.reliefWeb.BasicInfo;
import com.relief.reliefWeb.dto.*;
import com.relief.reliefWeb.repo.BasicInfoRepo;
import com.relief.reliefWeb.response.Responses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BasicInfoServiceImplementation implements BasicInfoService{
    @Autowired
    BasicInfoRepo basicInfoRepo;




    public List<BasicInfo> getAllBasicInfo() {
        return basicInfoRepo.findAll();
    }
    @Override
//

    public Responses<Long> createBasicInfo(CreateBasicInfoDto basicInfoDto) {
        try {
            BasicInfo basicInfo = new BasicInfo();
            basicInfo.setFullName(basicInfoDto.getFullName());
            basicInfo.setEmail(basicInfoDto.getEmail());
            basicInfo.setPhoneNumber(basicInfoDto.getPhoneNumber());

            BasicInfo savedBasicInfo = basicInfoRepo.save(basicInfo);

            return new Responses<>(200, "Basic info created successfully", savedBasicInfo.getId());
        } catch (Exception e) {
            return new Responses<>(500, "An error occurred while creating basic info", null);
        }
    }

    @Override

    public Responses<String> addOnboarding(Long id, OnboardingDto basicInfoDto) {
        Optional<BasicInfo> basicInfoOptional = basicInfoRepo.findById(id);

        if (basicInfoOptional.isPresent()) {
            BasicInfo basicInfo = basicInfoOptional.get();
            basicInfo.setProductName(basicInfoDto.getProductName());
            basicInfo.setProductSummary(basicInfoDto.getProductSummary());
            basicInfo.setProjectBrief(basicInfoDto.getProjectBrief());
            basicInfo.setProjectFeatures(basicInfoDto.getProjectFeatures());
            basicInfoRepo.save(basicInfo);

            return new Responses<>(200, "Onboarding added successfully", "Onboarding details updated for ID " + id);
        } else {
            return new Responses<>(404, "BasicInfo with specified ID not found", "No BasicInfo found for ID " + id);
        }
    }

    @Override
    public Responses<String> addProjectBrief(Long id, ProjectBriefDto basicInfoDto) {
        Optional<BasicInfo> basicInfoOptional = basicInfoRepo.findById(id);

        if (basicInfoOptional.isPresent()) {
            BasicInfo basicInfo = basicInfoOptional.get();
            basicInfo.setDevelopmentPhase(basicInfoDto.getDevelopmentPhase());
            basicInfo.setBrandingGuides(basicInfoDto.getBrandingGuides());
            basicInfo.setRelevantBrandBook(basicInfoDto.getRelevantBrandBook());
            basicInfo.setImportance(basicInfoDto.getImportance());
            basicInfoRepo.save(basicInfo);

            return new Responses<>(200, "Project brief added successfully", "Project brief details updated for ID " + id);
        } else {
            return new Responses<>(404, "BasicInfo with specified ID not found", "No BasicInfo found for ID " + id);
        }
    }




    @Override
    public Responses<String> addBranding(Long id, BrandingDto basicInfoDto) {
        Optional<BasicInfo> basicInfoOptional = basicInfoRepo.findById(id);

        if (basicInfoOptional.isPresent()) {
            BasicInfo basicInfo = basicInfoOptional.get();
            basicInfo.setBuiltProductBefore(basicInfoDto.getBuiltProductBefore());
            basicInfo.setBestAppliesToYou(basicInfoDto.getBestAppliesToYou());
            basicInfo.setServicesInNeedOf(basicInfoDto.getServicesInNeedOf());
            basicInfoRepo.save(basicInfo);

            return new Responses<>(200, "Branding added successfully", "Branding details updated for ID " + id);
        } else {
            return new Responses<>(404, "BasicInfo with specified ID not found", "No BasicInfo found for ID " + id);
        }
    }

    @Override
    public Responses<String> addFunding(Long id, FundingDto basicInfoDto) {
        Optional<BasicInfo> basicInfoOptional = basicInfoRepo.findById(id);

        if (basicInfoOptional.isPresent()) {
            BasicInfo basicInfo = basicInfoOptional.get();
            basicInfo.setAcquiredFunding(basicInfoDto.getAcquiredFunding());
            basicInfo.setFundingStage(basicInfoDto.getFundingStage());
            basicInfo.setBudget(basicInfoDto.getBudget());
            basicInfoRepo.save(basicInfo);

            return new Responses<>(200, "Funding details added successfully", "Funding details updated for ID " + id);
        } else {
            return new Responses<>(404, "BasicInfo with specified ID not found", "No BasicInfo found for ID " + id);
        }
    }

    @Override
    public Responses<String> addTimeline(Long id, TimeLineDto basicInfoDto) {
        Optional<BasicInfo> basicInfoOptional = basicInfoRepo.findById(id);

        if (basicInfoOptional.isPresent()) {
            BasicInfo basicInfo = basicInfoOptional.get();
            basicInfo.setProjectCommerence(basicInfoDto.getProjectCommence());
            basicInfo.setProjectCompletion(basicInfoDto.getProjectCompletion());
            basicInfoRepo.save(basicInfo);

            return new Responses<>(200, "Timeline added successfully", "Timeline details updated for ID " + id);
        } else {
            return new Responses<>(404, "BasicInfo with specified ID not found", "No BasicInfo found for ID " + id);
        }
    }


}



