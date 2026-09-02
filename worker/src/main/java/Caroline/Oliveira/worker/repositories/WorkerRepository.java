package Caroline.Oliveira.worker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Caroline.Oliveira.worker.entities.Worker;

public interface WorkerRepository  extends JpaRepository<Worker, Long>{

}
