package com.mts.teta.repositories;

import com.mts.teta.models.User;

import java.util.List;
import java.util.Optional;

public class UserRepositoryImpl implements UserRepository {
    private List<User> ds = null;

    @Override
    public Optional<User> findByMsisdn(String msisdn) {
        return ds.stream().filter(user -> msisdn.equals(user.getPhone())).findFirst();
    }
}
