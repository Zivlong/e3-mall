package cn.e3mall.sso.service;

import cn.e3mall.common.utils.E3Result;

public interface LoginService {

	// 参数：用户名和密码
	// 业务逻辑：
	// 返回值：E3Result，其中包含token信息
	E3Result userLogin(String username, String password);
}
