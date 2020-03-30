package service.impl;/*
 *@author lenovo
 *@date 2020/3/23 13:52 :23
 *@description
 */

import domain.Account;
import org.springframework.stereotype.Service;
import service.AccountService;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    public List<Account> findAll() {
        System.out.println("业务层，查询账户。。。");
        return null;
    }

    public void saveAccount(Account account) {
        System.out.println("业务层，保存账户。。。");
    }
}
