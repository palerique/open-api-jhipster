package br.com.palerique.service;

import br.com.palerique.service.api.dto.Pet;
import br.com.palerique.web.api.PetApiDelegate;
import java.util.List;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PetApiDelegateImpl implements PetApiDelegate {
  @Override
  public ResponseEntity<List<Pet>> findPetsByStatus(final String status) {
    return ResponseEntity.ok(
        List.of(new Pet().id(RandomUtils.nextLong()).status(Pet.StatusEnum.fromValue(status))));
  }
}
