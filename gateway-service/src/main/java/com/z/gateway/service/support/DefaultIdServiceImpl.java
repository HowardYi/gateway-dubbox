/**
 * 
 */
package com.z.gateway.service.support;

import java.util.concurrent.atomic.AtomicInteger;

import com.z.gateway.service.IdService;

/**
 * @author Administrator
 *
 */

public class DefaultIdServiceImpl implements IdService {

    private AtomicInteger ai = new AtomicInteger(1);

    @Override
    public String genInnerRequestId() {
        return String.valueOf(ai.getAndIncrement());
    }
    
    

}
