package com.gpmall.shopping.dto;

import com.gpmall.commons.result.AbstractRequest;
import lombok.Data;

/**
 * Created by mic on 2019/7/23.
 */
@Data
public class AddCartRequest extends AbstractRequest{

    private Integer userId;
    private Integer itemId;
    private Integer num;

    @Override
    public void requestCheck() {

    }
}
