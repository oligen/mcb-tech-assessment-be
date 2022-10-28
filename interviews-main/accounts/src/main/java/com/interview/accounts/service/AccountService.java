package com.interview.accounts.service;

import com.interview.accounts.mapper.AccountsMapper;
import com.interview.accounts.model.GetAccountsResponseBody;
import com.interview.accounts.repo.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AccountService {

    private final AccountRepository repository;

    public GetAccountsResponseBody getAccounts() {

        return new GetAccountsResponseBody(repository.count(),AccountsMapper.map(repository.findAll()));
    }
}
