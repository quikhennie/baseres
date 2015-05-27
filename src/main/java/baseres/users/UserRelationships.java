package baseres.users;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Table(uniqueConstraints = { 
        @UniqueConstraint(columnNames = {"owningUser", "sharingUser"})}) //only one relationship allowed
public class UserRelationships {
	
	private final static int RELATIONSHIP_LINKED = 0;
	private final static int RELATIONSHIP_FOLLOWING = 1;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(nullable=false)
	String owningUser;
	@Column(nullable=false)
	int relationshipType;
	@Column(nullable=false)
	String sharingUser;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getOwningUser() {
		return owningUser;
	}
	public void setOwningUser(String owningUser) {
		this.owningUser = owningUser;
	}
	public int getRelationshipType() {
		return relationshipType;
	}
	public void setRelationshipType(int relationshipType) {
		this.relationshipType = relationshipType;
	}
	public String getSharingUser() {
		return sharingUser;
	}
	public void setSharingUser(String sharingUser) {
		this.sharingUser = sharingUser;
	}
	public static int getRelationshipLinked() {
		return RELATIONSHIP_LINKED;
	}
	public static int getRelationshipFollowing() {
		return RELATIONSHIP_FOLLOWING;
	}
}
