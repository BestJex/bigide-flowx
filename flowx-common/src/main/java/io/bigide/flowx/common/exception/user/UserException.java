package io.bigide.flowx.common.exception.user;

import io.bigide.flowx.common.exception.BaseException;

/**
 * 用户信息异常类
 * 
 * @author bigide
 */
public class UserException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
