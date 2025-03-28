package br.edu.ifspcjo.ads.dw2a6.ifitness.repositoriy;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifspcjo.ads.dw2a6.ifitness.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
