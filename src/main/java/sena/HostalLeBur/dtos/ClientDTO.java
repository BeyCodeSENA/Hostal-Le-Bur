package sena.HostalLeBur.dtos;

import sena.HostalLeBur.models.Client;

public class ClientDTO {
    private long id;
    private String firstName;
    private String lastName;
    private String email;

    public ClientDTO(Client client){
        this.id = client.getId();
        this.firstName = client.getFirstName();
        this.lastName = client.getLastName();
        this.email = client.getEmail();

    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
}
