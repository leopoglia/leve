import { Route, Routes, BrowserRouter } from "react-router-dom";

import App from "./components/App/App";
import Trip from "./components/Trip/Trip";
import Trips from "./components/Trips/Trips";
import Admin from "./components/Admin/Admin";


export default function Router() {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<App />} />
                <Route path="/trip/:id" element={<Trip />} />
                <Route path="/trips" element={<Trips />} />
                <Route path="/admin" element={<Admin />} />

            </Routes>
        </BrowserRouter>
    )
}