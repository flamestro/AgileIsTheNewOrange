package de.flamestro.AgileIsTheNewOrange.web.model;

import de.flamestro.AgileIsTheNewOrange.board.model.Card;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CardResponse {
    private final Status status;
    private final Card card;
}
