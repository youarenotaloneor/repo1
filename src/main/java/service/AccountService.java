package service;/*
 *@author lenovo
 *@date 2020/3/23 13:50 :38
 *@description
 */

import domain.Account;

import java.util.List;

public interface AccountService {
    //查询所有账户
    public List<Account> findAll();
    //保存账户信息
    public void saveAccount(Account account);

}
