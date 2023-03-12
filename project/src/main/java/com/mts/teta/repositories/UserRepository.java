package com.mts.teta.repositories;

import com.mts.teta.models.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findByMsisdn(String msisdn);
}
