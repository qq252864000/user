package com.authority.exception;

/**
 * @Auther: 欧阳正雄
 * @Date: 2018/6/23 0023 05:43
 * @Description: 异常
 */
public class UserException extends RuntimeException  {

    public UserException() {
        super();
    }

    public UserException(String message) {
        super(message);
    }

    public UserException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserException(Throwable cause) {
        super(cause);
    }

    protected UserException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
