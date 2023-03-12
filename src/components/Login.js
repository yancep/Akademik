import React, { useState } from "react";
import "./Formulario.css";

export default function Login({setUser}) {
  const [nombre, setNombre] = useState("");
  const [contraseña, setContraseña] = useState("");
  const [tex, setTex] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();
    if (nombre === "" || contraseña === "") {
      setTex("prueba");
      return;
    }
    setTex("");
    setUser([nombre])
  };
  return (
    <section id="sec">
      <h1 className="log">Login</h1>

      <form className="formulario" onSubmit={handleSubmit}>
        <input
          type="text"
          id="usuario"
          value={nombre}
          onChange={(e) => setNombre(e.target.value)}
        />
        <input
          type="password"
          id="contra"
          value={contraseña}
          onChange={(e) => setContraseña(e.target.value)}
        />
        <button id="bot">Iniciar Sesion</button>
        <p>{tex}</p>
      </form>
    </section>
  );
}
