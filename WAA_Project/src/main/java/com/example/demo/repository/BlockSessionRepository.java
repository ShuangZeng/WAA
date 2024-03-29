package com.example.demo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Block;
import com.example.demo.domain.BlockSession;

@Repository
public interface BlockSessionRepository extends JpaRepository<BlockSession, Integer>{
	BlockSession findBySession(Date session);
	
	List<BlockSession> findByBlock(Block block);
	
	@Query(value="select count(bs.id) from block_session bs where bs.session >= :entryDate and bs.session <= getDate()", nativeQuery = true)
	public Double getTotalSessionByEntryDate(Date entryDate);
}
