package org.supertlon.funcionalidad;


import java.util.*;
public class Usuario {
    public Usuario() {
    }
    private tipoUsuarios tipoUsuario;
    public tipoUsuarios gettipoUsuarios() {
        return this.tipoUsuario;
    }
    public void settipoUsuarios(tipoUsuarios tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    public enum tipoUsuarios {
        SoporteTecnico,
        Administrativo,
        Cliente
    }

}