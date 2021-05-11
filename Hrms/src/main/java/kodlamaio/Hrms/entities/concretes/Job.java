package kodlamaio.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;


@Entity
@Data
@Table(name="jobs")
public class Job {
	
	public Job() {
		
	}
	
	public Job(int id, String jobName) {
		super();
		this.id = id;
		this.jobName = jobName;
	}

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="job_name")
	private String jobName;
}
