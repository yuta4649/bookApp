package com.example.book.domain.service.impl;

import com.example.book.domain.entity.User;
import com.example.book.domain.repository.UserRepository;
import com.example.book.domain.service.UserDomainService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * UserDomainServiceのImpl
 *
 * @author YutaMori
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class UserDomainServiceImpl implements UserDomainService {

    /**
     * UserRepository
     */
    private final UserRepository userRepository;

    /**
     * メールアドレスからUser情報を取得する
     *
     * @param mailAddress メールアドレス
     * @return OptionalUser
     */
    @Override
    public User getUserByMailAddress(String mailAddress) {
        return userRepository.getUserByMailAddress(mailAddress).orElseThrow();
    }
}
