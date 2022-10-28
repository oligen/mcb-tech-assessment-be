package com.interview.accounts.controller;

import com.interview.accounts.model.GetAccountsResponseBody;
import com.interview.accounts.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountsController {

    @Autowired
    private AccountService accountService;

    @GetMapping
    public ResponseEntity<GetAccountsResponseBody> getAccounts() {
        return ResponseEntity.ok(accountService.getAccounts());
    }
}
