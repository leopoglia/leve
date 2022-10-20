import './style.css';

export default function Header() {
    return (
        <div className="top-app">
            <dl>
                <dd>
                    <span class="material-symbols-outlined">
                        flight_takeoff
                    </span>
                    Avião
                </dd>
                <dd>
                    <span class="material-symbols-outlined">
                        train
                    </span>
                    Trem
                </dd>

                <dd>
                    <span class="material-symbols-outlined">
                        airport_shuttle
                    </span>
                    Ônibus
                </dd>
            </dl>

            <div className='box'>


                <div className='busca'>
                    <div className='de'>
                        <div className='label'>
                            <label>De</label>
                            <span class="material-symbols-outlined">
                                north_east
                            </span>
                        </div>
                        <input type="text" placeholder='De' />
                    </div>

                    <div className='sync'>
                        <span class="material-symbols-outlined">
                            sync_alt
                        </span>
                    </div>

                    <div className='para'>
                        <div className='label'>
                            <label>Para</label>

                            <span class="material-symbols-outlined">
                                south_east
                            </span>
                        </div>
                        <input type="text" placeholder='Para' />
                    </div>
                </div>

                <div className='infos'>
                    <div className='data'>

                        <div className='ida'>
                            <label>Ida</label>
                            <input type="date" />
                        </div>

                        <div className='data-sync'>
                            <span class="material-symbols-outlined">
                                follow_the_signs
                            </span>
                        </div>

                        <div className='volta'>
                            <label>Volta</label>
                            <input type="date" />
                        </div>

                    </div>
                </div>


                <div className='footer-box'>
                    <div className='pass'>
                        <div className='label'>
                            <label>Passageiros</label>
                        </div>

                        <div className='number'>

                            <div className='most'><span>-</span></div>

                            <input type="number" placeholder='0' />

                            <div className='less'><span>+</span></div>

                        </div>

                    </div>

                    <input className='get' type="button" value='Buscar' />
                </div>



            </div>
        </div>
    );
}  