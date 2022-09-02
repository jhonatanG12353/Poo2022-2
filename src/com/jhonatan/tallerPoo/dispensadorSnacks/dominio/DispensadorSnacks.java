package com.jhonatan.tallerPoo.dispensadorSnacks.dominio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DispensadorSnacks {
    private  List<Snacks> snacks;
    private static  final  int LIMITE_SNACKS = 12;
    private int cantidadActual;

    public DispensadorSnacks() {
        this.snacks = new ArrayList<>();
    }

    public void agregarUnSnacks (int codigo, String snacks , double precio, String marca) {
        Snacks snackAgregar = new Snacks (codigo,snacks,precio,marca);
        if ((this.snacks.size() + 1) <= LIMITE_SNACKS){
            this.snacks.add(snackAgregar);
        } else {
            System.out.println("No se pueden agregar mas snacks, la maquina ya esta llena para este snacks");
        }
    }
    public void retirarSnackPorCodigo(String codigo) {
        Snacks snackARetirar = buscarSnackPorCodigo(Long.parseLong(codigo));
        if ((snackARetirar != null)&&(snackARetirar.getCantidadActualSnacks()>0)) {

            this.cantidadActual = snackARetirar.getCantidadActualSnacks()-1;
            snackARetirar.setCantidadActualSnacks(this.cantidadActual);
            System.out.println("El snack "+ snackARetirar.getSnacks() + " ha sido retirado");
            System.out.println("Quedan: " + snackARetirar.getCantidadActualSnacks());

        }
        else if ((snackARetirar != null)&&(snackARetirar.getCantidadActualSnacks()==0)){
            System.out.println("El snack se encuentra agotado.");

        }
        else {
            System.out.println("No se ha podido retirar el snack, el snack no existe.");
        }
    }

    public void retirarSnackPorTiposnacks(String nombre) {
        Snacks snackARetirar = this.snacks.stream()
                .filter(snackName -> snackName.getSnacks().equalsIgnoreCase(nombre))
                .findFirst().orElse(null);
        if ((snackARetirar != null)&&(snackARetirar.getCantidadActualSnacks()>0)){
            this.cantidadActual = snackARetirar.getCantidadActualSnacks()-1;
            snackARetirar.setCantidadActualSnacks(this.cantidadActual);
            System.out.println("El snack " + snackARetirar.getSnacks() + " ha sido retirado");
            System.out.println("Quedan: " +snackARetirar.getCantidadActualSnacks());
        }
        else if ((snackARetirar != null)&&(snackARetirar.getCantidadActualSnacks()==0)) {
            System.out.println("El snack no esta disponible.");
        }
        else {
            System.out.println("El snack no existe, no ah sido retirado.");
        }
    }
    public void aumentarSnack(long codigo, int cantidadAAumentar) {
        Snacks snackAumentado = buscarSnackPorCodigo(codigo);
        if ((snackAumentado != null)&&(snackAumentado.getCantidadActualSnacks()<6)){
            this.cantidadActual = snackAumentado.getCantidadActualSnacks() + cantidadAAumentar;
            if (this.cantidadActual <= 6) {
                snackAumentado.setCantidadActualSnacks(this.cantidadActual);
                System.out.println("El snack "+snackAumentado.getSnacks() + "ha sido abastecido en "
                        + cantidadAAumentar + " unidades");
            }
            else {
                System.out.println("No se ha abastecido, ha excedido la cantidad permitida.");
            }
        } else {
            System.out.println("No se ha abastecido, el snack no existe.");
        }
    }
    public void quitarSnack(long codigo) {
        Snacks snackAQuitar = buscarSnackPorCodigo(codigo);
        if (snackAQuitar != null) {
            this.snacks.remove(snackAQuitar);
            System.out.println("Se ha quitado el snack " + snackAQuitar.getSnacks());
        } else {
            System.out.println("No se ha quitado, el snack no existe.");
        }
    }
    public Snacks cantidadSnack(long codigo) {
        Snacks cantidadSnack = buscarSnackPorCodigo(codigo);
        if ((cantidadSnack != null)&&(cantidadSnack.getCantidadActualSnacks()>0)){
            System.out.println("Quedan: " +cantidadSnack.getCantidadActualSnacks() + " unidades del snack " +cantidadSnack.getSnacks());
            return cantidadSnack;
        } else {
            System.out.println("El snack no existe en la maquina, Se encuentra agotado.");
            return null;
        }
    }
    public List<Snacks> snackAgotados() {
        List<Snacks> snackAgotados = this.snacks.stream()
                .filter(snack -> snack.getCantidadActualSnacks()==0)
                .collect(Collectors.toList());
        if (snackAgotados != null) {
            System.out.println("Snacks agotados: ");
            snackAgotados.forEach(snackD -> System.out.println(snackD.getSnacks()+" --> "+snackD.getPrecio()));
            return snackAgotados;
        } else {
            System.out.println("No hay ningun snack agotado.");
            return null;
        }
    }
    public List<Snacks> snackDisponibles() {
        List<Snacks> snackDisponibles = this.snacks.stream()
                .filter(snack -> snack.getCantidadActualSnacks()>0)
                .collect(Collectors.toList());
        if (snackDisponibles != null) {
            System.out.println("Snacks disponibles: ");
            snackDisponibles.forEach(snackD -> System.out.println(snackD.getSnacks()+" --> "+snackD.getPrecio()));
            return snackDisponibles;
        } else {
            System.out.println("No queda ningun snack.");
            return null;
        }
    }
    public void snackOrdenadoPrecio () {
        this.snacks.sort(Comparator.comparing(Snacks::getPrecio).reversed());
        this.listaDeSnacks();
    }

    public void snackOrdenadoCantidad () {
        this.snacks.sort(Comparator.comparing(Snacks::getCantidadActualSnacks));
        this.listaDeSnacks();
    }



    public Snacks buscarSnackPorCodigo(long codigoAbuscar) {
        Snacks snacksBuscado = null;
        for (Snacks snacks1 : this.snacks) {
            if (snacks1.getCodigo() == codigoAbuscar) {
                snacksBuscado = snacks1;
            }
        }
        return snacksBuscado;
    }
    private void listaDeSnacks () {
        this.snacks.forEach(snack -> System.out.println(snack.getSnacks() + " "
                + snack.getCodigo() + " --> " + snack.getPrecio() + " cantidad: " + snack.getCantidadActualSnacks()));
    }




}
