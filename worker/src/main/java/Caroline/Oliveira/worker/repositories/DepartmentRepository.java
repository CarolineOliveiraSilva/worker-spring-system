package Caroline.Oliveira.worker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Caroline.Oliveira.worker.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
