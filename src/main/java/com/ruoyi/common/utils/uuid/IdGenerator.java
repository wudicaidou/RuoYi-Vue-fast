package com.ruoyi.common.utils.uuid;

import com.ruoyi.common.utils.DateUtils;
import org.apache.logging.log4j.core.util.UuidUtil;


public class IdGenerator {
	
	public static String generatorOrderId() {
		String orderId = String.format("%s%d", DateUtils.dateTimeNow(), SnowflakeIdWorker.getInstance().nextId());
		if (orderId.length() <= 32) {
			return orderId;
		}
		return orderId.substring(0, 32);
	}
	
	public static Long generatorLongId() {
		return SnowflakeIdWorker.getInstance().nextId();
	}

	public static String generatorId() {
		long id = SnowflakeIdWorker.getInstance().nextId();
		String uuid = uuid2();
		return String.format("%d%s", id, uuid);
	}

	public static String uuid2() {
		return UuidUtil.getTimeBasedUuid().toString().replaceAll("-", "");
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println(generatorId());
	}
}
