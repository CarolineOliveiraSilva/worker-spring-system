package Caroline.Oliveira.worker.config;


import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;

import Caroline.Oliveira.worker.entities.Department;
import Caroline.Oliveira.worker.entities.HourContract;
import Caroline.Oliveira.worker.entities.Worker;
import Caroline.Oliveira.worker.entities.WorkerLevel;
import Caroline.Oliveira.worker.repositories.DepartmentRepository;
import Caroline.Oliveira.worker.repositories.WorkerRepository;

@Configuration
public class SeedingConfig implements CommandLineRunner{
	
	private final DepartmentRepository departmentRepository;
	
	private final WorkerRepository workerRepository;

	SeedingConfig(WorkerRepository workerRepository, DepartmentRepository departmentRepository) {
		this.workerRepository = workerRepository;
		this.departmentRepository = departmentRepository;
	}
	
	
	@Transactional
	@Override
	public void run(String... args) throws Exception{
		
		
		Department dept = new Department("Design");
		
		dept = departmentRepository.save(dept);

		Worker worker = new Worker("Alex", WorkerLevel.MID_LEVEL, 1200.0, dept);
		
		worker = workerRepository.save(worker);
		
		HourContract contract1 = new HourContract(LocalDate.of(2018, 8, 20), 50.0, 20);
		HourContract contract2 = new HourContract(LocalDate.of(2018, 6, 13), 30.0, 18);
		HourContract contract3 = new HourContract(LocalDate.of(2018, 8, 25), 80.0, 10);
		
		worker.addContract(contract1);
		worker.addContract(contract2);
		worker.addContract(contract3);	
		
}
	
}

