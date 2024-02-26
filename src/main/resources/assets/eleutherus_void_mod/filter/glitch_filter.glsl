uniform sampler2D inputTexture;
out vec4 fragColor;

void main() {
    // Определяем координаты в текстуре
    vec2 uv = gl_FragCoord.xy / vec2(1920.0, 1080.0);

    // Создаем глитч-эффект, изменяя координаты текстуры случайным образом
    vec2 glitchUV = uv + vec2(sin(uv.y * 100.0), cos(uv.x * 50.0)) * 0.01;

    // Получаем цвет из измененных координат
    vec4 color = texture(inputTexture, glitchUV);

    // Применяем цвет к фрагменту
    fragColor = color;
}

