package com.jpa.test.loggingShopLogging;

import java.io.Serializable;
import java.util.UUID;


/**
 * This class geneneate random UUID
 * 
 * @author MohdSharik
 * @version 1.0
 */

public class Activity implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private UUID activityId;

	public UUID getActivityId() {
		return this.activityId;
	}

	public void setActivityId(UUID activityId) {
		this.activityId = activityId;
	}


}
