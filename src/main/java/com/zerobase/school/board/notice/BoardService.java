package com.zerobase.school.board.notice;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
@RequiredArgsConstructor
@Service @Transactional
public class BoardService {
    private final BoardRepository boardRepository;
    public void boardDelete(Long id){
     boardRepository.deleteById(id);}}