/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.page.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.thinkgem.jeesite.common.config.Global;
import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.page.util.EmojiUtil;
import com.thinkgem.jeesite.modules.weixin.util.WxUtil;
import com.thinkgem.jeesite.modules.zl.entity.ZlGoods;
import com.thinkgem.jeesite.modules.zl.entity.ZlUser;
import com.thinkgem.jeesite.modules.zl.entity.ZlWxSetting;
import com.thinkgem.jeesite.modules.zl.service.ZlGoodsService;
import com.thinkgem.jeesite.modules.zl.service.ZlUserService;
import com.thinkgem.jeesite.modules.zl.service.ZlWxSettingService;

/**
 * 购物车
 * 
 * @author yjg
 * @version 2018-09-14
 */
@Controller
@RequestMapping(value = "${adminPath}/")
public class HomeController extends BaseController {
	
	@Autowired
	private ZlGoodsService zlGoodsService;
	private Logger log = Logger.getLogger(getClass());

	@RequestMapping(value = "page/home")
	public String shopcar(HttpSession session, Model model) {
		
		return "modules/page/home";
	}

}