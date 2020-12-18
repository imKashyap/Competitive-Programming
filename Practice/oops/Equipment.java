package myPrograms.oops;

public class Equipment {
	String id;
	String description;

	Equipment(String id, String desc) {
		this.id = id;
		this.description = desc;
	}

	String getId() {
		return id;
	}

	String getDesc() {
		return description;
	}
}
