package com.rubix.webservices.gadmin.master.boards.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rubix.webservices.gadmin.master.boards.model.Boards;

public interface BoardRepository extends JpaRepository<Boards, Long> {

}
