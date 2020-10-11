package com.Jdempotent.core.config;

import com.Jdempotent.core.constant.CryptographyAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigUtility {
    @Value("${jdempotent.cryptography.algorithm}")
    private CryptographyAlgorithm algorithm;
}
