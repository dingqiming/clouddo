package com.bootdo.clouddozuul.prc.admin;

import com.bootdo.clouddocommon.dto.MenuDTO;
import com.bootdo.clouddocommon.intercepter.FeignIntercepter;
import feign.Headers;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Headers("Content-Type:application/json")
@FeignClient(name = "admin",configuration = FeignIntercepter.class)
public interface MenuService {
    @GetMapping ("/api/menu/userMenus")
    List<MenuDTO> userMenus();
}
