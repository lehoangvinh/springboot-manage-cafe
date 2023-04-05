package com.nix.managecafe.payload.response;

import com.nix.managecafe.model.Menu;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartResponse {
    private Long id;
    private Menu menu;
    private Long quantity;
    private boolean deleted;
}
