import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Navbar from 'components/Navbar';
import Home from 'pages/Home';
import Admin from 'pages/Admin';
import Controle from 'pages/Controle';
import Auth from 'pages/Admin/Auth';
import User from 'pages/Admin/User';

const Rotas = () => (
  <BrowserRouter>
    <Navbar />
    <Routes>
      <Route path="/" element={<Auth />} />
      <Route path="/controle" element={<Controle />} />
      <Route path="/admin" element={<Admin />} />
      <Route path="/admin/auth" element={<Auth />} />
      <Route path="/admin/user" element={<User />} />
      
    </Routes>
    
  </BrowserRouter>
);

export default Rotas;
