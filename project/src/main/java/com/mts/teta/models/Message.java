package com.mts.teta.models;

import lombok.Getter;

@Getter
public class Message {
    private String content;
    private EnrichmentType enrichmentType;

    public enum EnrichmentType {
        MSISDN;
    }
}
