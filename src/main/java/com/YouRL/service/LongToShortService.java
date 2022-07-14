package com.YouRL.service;

import com.YouRL.Entity.LongToShort;

public interface LongToShortService {
    public String generateShortenUrl();
    public LongToShort getShortenUrlByLongUrl(String longUrl);
    public void saveUrl(LongToShort url);
}