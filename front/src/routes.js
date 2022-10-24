import { Route, Routes, BrowserRouter } from "react-router-dom";

import App from "./components/App/App";
import Trip from "./components/Trip/Trip";
import Trips from "./components/Trips/Trips";


export default function Router() {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<App />} />
                <Route path="/trip" element={<Trip />} />
                <Route path="/trips" element={<Trips />} />

            </Routes>
        </BrowserRouter>
    )
}