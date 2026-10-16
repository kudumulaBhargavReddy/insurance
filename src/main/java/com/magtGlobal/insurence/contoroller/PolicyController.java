package com.magtGlobal.insurence.contoroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.magtGlobal.insurence.entity.InsurancePolicy;
import com.magtGlobal.insurence.service.PolicyService;

@RestController
@RequestMapping("/api/policies")
public class PolicyController {

	/*
	 * testing
	 */
    @Autowired
    private PolicyService policyService;

    @GetMapping
    public List<InsurancePolicy> getAllPolicies() {
        return policyService.getAllPolicies();
    }

    @GetMapping("/{id}")
    public InsurancePolicy getPolicyById(@PathVariable Long id) {
        return policyService.getPolicyById(id).orElseThrow(() -> new RuntimeException("Policy not found with id: " + id));
    }
    @PostMapping
    public InsurancePolicy createPolicy(@RequestBody InsurancePolicy policy) {
        return policyService.createPolicy(policy);
    }

    @DeleteMapping("/{id}")
    public String deletePolicy(@PathVariable Long id) {
        policyService.deletePolicy(id);
        return "Policy deleted successfully with id: " + id;
    }
}