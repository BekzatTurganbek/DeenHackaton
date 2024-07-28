package com.alibou.security.hickmet.service;

import com.alibou.security.hickmet.dto.PilgrimDto;
import com.alibou.security.hickmet.model.Pilgrim;
import com.alibou.security.hickmet.repository.PilgrimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PilgrimService {

    @Autowired
    PilgrimRepository pilgrimRepository;
    public Optional<PilgrimDto> getPilgrimById(Long id) {
        Optional<Pilgrim> pilgrim = pilgrimRepository.findById(id);
        return pilgrim.map(this::convertToDto);
    }

    private PilgrimDto convertToDto(Pilgrim pilgrim) {
        PilgrimDto pilgrimDto = new PilgrimDto();
        pilgrimDto.setId(pilgrim.getId());
        pilgrimDto.setLastName(pilgrim.getLastName());
        pilgrimDto.setPhoto(pilgrim.getPhoto());
        pilgrimDto.setAge(pilgrim.getAge());
        pilgrimDto.setBirthCity(pilgrim.getBirthCity());
        pilgrimDto.setRoomNumber(pilgrim.getRoomNumber());
        pilgrimDto.setPhoneNumber(pilgrim.getPhoneNumber());
        pilgrimDto.setWhatsapp(pilgrim.getWhatsapp());
        pilgrimDto.setTelegram(pilgrim.getTelegram());
        pilgrimDto.setLocation(pilgrim.getLocation());
        pilgrimDto.setSpecialNotes(pilgrim.getSpecialNotes());
        pilgrimDto.setVisa(pilgrim.getVisa());
        pilgrimDto.setInsurance(pilgrim.getInsurance());

        return pilgrimDto;
    }
}
