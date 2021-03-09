package com.oneby.service;

import com.oneby.exception.MyException;

import java.io.FileNotFoundException;

/**
 * @ClassName DemoService
 * @Description TODO
 * @Author Oneby
 * @Date 2021/3/9 15:38
 * @Version 1.0
 */
public interface DemoService {

    void show1();

    void show2();

    void show3() throws FileNotFoundException;

    void show4();

    void show5() throws MyException;

}
